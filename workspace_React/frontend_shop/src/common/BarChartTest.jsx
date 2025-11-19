import React from 'react'
import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  BarElement,
  Title,
  Tooltip,
  Legend,
} from 'chart.js'
import { Bar } from 'react-chartjs-2'

ChartJS.register(
  CategoryScale,
  LinearScale,
  BarElement,
  Title,
  Tooltip,
  Legend
);

// Bar 차트 연습장
const BarChartTest = () => {
  
  // options
  const options = {
    responsive: true,
    plugins: {
      legend: {
        position: 'bottom',
      },
      title: {
        display: true,
        text: 'Chart.js Bar Chart',
      },
    },
  };

  // data
  const data = {
    // key랑 value 값이 일치하기하기 때문에 key값 하나만 적어도 상관 없음. (vlaue 생략)
    labels : ['상추', '배추', '딸기', '감자', '고구마', '방울토마토'],
    // key: [value]
    datasets: [
      {
        label: '재배량 (그램)',
        data: [10, 20, 5, 300, 700, 900, 150],
        backgroundColor: 'rgba(0, 255, 55, 0.7)',
      },
      {
        label: '습도 (시간)',
        data: [14, 29, 10, 200, 400, 500, 340],
        backgroundColor: 'rgba(255, 195, 67, 0.98)',
      },
    ],
  };
  return (
    <div>
      <Bar 
        options={options}
        data={data}
      />
    </div>
  )
}

export default BarChartTest