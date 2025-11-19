# 최초로 프로젝트 생성시 flask 설시 -> pip install flask
# cors 해결을 위한 라이브러리 설시 -> pip install flask-cors

from flask import Flask, request

app = Flask(__name__)


@app.route('/', methods=['GET'])
def hello():
  return 'Hello, World!'

# 버튼 1 클릭 시 호출 api
@app.route('/t1', methods=['GET'])
def test1():
  return {'name' : 'python'}

# 버튼 2 클릭 시 호출 api, UrlParameter 데이터 가져오기
# 문자열이오면 <stream>
# 리턴할 데이터가 없어도 빈문자열('')이나 빈 객체를 리턴
@app.route('/t2/<int:num>', methods=['GET'])
def test2(num):
  print(f'전달된 데이터 ={num}')
  return {}

# 버튼 3 클릭 시 호출 api, Post 방식으로 데이터 가져오기
@app.route('/t3', methods=['POST'])
def test3():
  # post로 넘어온 데이터를 받는 문법
  data = request.get_json()
  print(data.get('stuName'))
  print(data.get('stuAge'))
  return {}

# 버튼 4 클릭 시 호출 api, querry string 방식으로 데이터 가져오기
@app.route('/t4', methods=['GET'])
def test4():
  stuName = request.args.get('stuName')
  stuAge = request.args.get('stuAge')
  print(stuName, stuAge)
  return {}

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=5000)