import { useEffect, useState } from 'react';
import axios from 'axios';

const Axios_6 = () => {
  const [classList, setClassList] = useState([]);
  const [hobbyList, setHobbyList] = useState([]);

  useEffect(()=>{
    axios.get('/api/getClass')
    .then((res)=>{
      console.log(res.data);
      setClassList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    });
  },[]);

  useEffect(()=>{
    axios.get('/api/getHobby')
    .then((res)=>{
      console.log(res.data);
      setHobbyList(res.data)
    })
    .catch((error)=>{
      console.log(error);
    });
  },[]);

  return (
    <div>
      <select>
        <option>반 선택</option>
        {
          classList.map((e, i) => {
            return (
              <option key={i}>{e}</option>
            )
          })
        }
      </select> <br />

      {
        hobbyList.map((e, i) => {
          return (
            <span key={i}>
            <input type='checkbox' />{e}
            </span>
          )
        })
      }

    </div>
  )
}

export default Axios_6