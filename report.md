오픈 소스 프로젝트 보고서

6월 2일

채팅 어플을 만들기로 정함.

6월 3일

ReadMe에 팀 소개와 프로젝트 내용들을 작성함.

6월 5일

로그인과 회원가입창을 구성하고 기본적인 뼈대를 구성함

기여 방법을 씀.

6월 6일

채팅 어플 --> 커뮤니티 어플로 계획 변경

인터넷 권한 허용

첫화면을 로그인 창으로 변환

6월 7일

서버 구축

DB 로그인 회원가입 스키마 설계 완료

로그인, 회원가입 php 코드 

서버에 로그인, 회원가입 요청하는 기능 추가

회원가입 기능 완성

로그인 기능 완성

버튼이 기능하지 않는 오류 수정

최종 오류 수정


<img src="https://user-images.githubusercontent.com/55871387/85189698-10acaf80-b2ec-11ea-9d3f-ae500ec70274.jpg"  width="300" height="600">

<img src="https://user-images.githubusercontent.com/55871387/85189748-87e24380-b2ec-11ea-944b-22ea566a28af.jpg"  width="300" height="600">

<img src="https://user-images.githubusercontent.com/55871387/85189726-54071e00-b2ec-11ea-9964-8ba7ae761be3.jpg"  width="700" height="300">

![서버캡쳐본2](https://user-images.githubusercontent.com/55871387/85190420-44d79e80-b2f3-11ea-9fe1-c4d1abe5b59f.jpg)
![서버캡쳐본1](https://user-images.githubusercontent.com/55871387/85190422-4608cb80-b2f3-11ea-8035-5389e4ed3025.jpg)


6월 8일

listview 생성

ViewActivity.java 생성(MainActivity에서 list 클릭 시 게시물로 화면 전환)

list 클릭 시 게시물로 화면 전환 intent 추가

"게시물" 토스트 메세지 생성

새 게시글 작성 "+" 버튼 생성

"새 게시글 작성" 토스트 메세지 생성

새 게시글 작성으로 화면전환 intent 추가(writeActivity.java 필요)

WriteActivity에 "저장" 버튼, editText 추가


<img src="https://user-images.githubusercontent.com/55236612/85190580-9fbdc580-b2f4-11ea-88ff-6f4b010dd3c2.png"  width="400" height="600">
               
<img src="https://user-images.githubusercontent.com/55236612/85190605-d5fb4500-b2f4-11ea-8586-7c74267f2314.png"  width="400" height="600">

<img src="https://user-images.githubusercontent.com/55236612/85190589-b2d09580-b2f4-11ea-9d46-4a8fb2eaa514.png"  width="400" height="600">

<img src="https://user-images.githubusercontent.com/55236612/85190612-ee6b5f80-b2f4-11ea-9a0c-49b2c63e6ef4.png"  width="400" height="600">

<img src="https://user-images.githubusercontent.com/55236612/85190619-00e59900-b2f5-11ea-8830-3c5ecc33d1c2.png"  width="400" height="600">

<img src="https://user-images.githubusercontent.com/55871387/85189835-65045f00-b2ed-11ea-8f60-cb00800c0b61.jpg"  width="300" height="600">

WriteActivity 파일 생성

BBSWrite라는 게시글 작성시 게시글 제목, 내용, ID 를 넘겨받는 php 파일 생성

BBSWrite DB 구축

<img src= "https://user-images.githubusercontent.com/54140431/85195006-039eb900-b30a-11ea-9d65-5f50117e8a3a.png">

![DB](https://user-images.githubusercontent.com/54140431/85196491-837e5080-b315-11ea-938d-6c22a83204ee.png)

6월 9일 

슬라이드로 열고 닫고 하는 메뉴 생성

비밀번호 textview 삭제

메뉴 닫기 버튼 및 메뉴 열기 버튼 추가

6월 10일

메뉴판에 회원의 id가 나오게 수정

로그인시 튕김 현상 수정

전체적인 UI를 개선

6월 12일

기본적인 메뉴 기능 구현완료

<img src="https://user-images.githubusercontent.com/55871387/85189792-fd4e1400-b2ec-11ea-82ee-553f3a5535d1.jpg"  width="300" height="600">

<img src="https://user-images.githubusercontent.com/55871387/85189839-6c2b6d00-b2ed-11ea-846c-56f03cb35e3d.jpg"  width="300" height="600">

6월 20일

Activity_write 구현완료 - TITLE과 CONTENT라는 EditText 생성, 게시물 작성 완료 버튼인 add_button 생성 

MainActivity에서 userID를 WriteActivity로 넘기고 WriteActiviry에서 넘겨받은 userID 를 게시물 작성 시 사용할 수 있도록 함

WriteActivity 구현완료 - add_button을 누르면 입력받은 TITLE과 CONTENT를 BBSWrite라는 게시물 DB로 넘겨줌

<img src= "https://user-images.githubusercontent.com/54140431/85195036-3a74cf00-b30a-11ea-95f9-3c9bf39f8542.png"  width="300" height="600">

![BBSWriteDB](https://user-images.githubusercontent.com/54140431/85195039-406ab000-b30a-11ea-8647-79b8a0774e7b.png)

메뉴에서 회원 정보로 가는 버튼 추가

acitivity_information, InformationActivity 구현 완료 (기본만 함)

로그인 할 때 회원의 모든 정보를 가져온 후에 회원 정보 판에다 뿌림.

<img src="https://user-images.githubusercontent.com/55871387/85203406-978f7580-b348-11ea-9f98-00fb1f112b39.jpg"  width="300" height="600">

6월 21일

activity_information에 textview를 추가해서 이 textview가 어떤 정보인지 알아볼 수 있도록 만듦. (완성본)

<img src="https://user-images.githubusercontent.com/55871387/85221780-b0079a80-b3f1-11ea-8f71-56df5cab288d.jpg"  width="300" height="600">

introActivity 를 만들어 앱 시작할때 앱 로고와 아이콘을 보여주는 화면을 만듦.
background color변경, 앱 label 변경

<img src = "https://user-images.githubusercontent.com/54140431/85226142-e6084700-b410-11ea-9393-dc6675f3ebd2.png" width="300" height="600">

BOARD 테이블의 서버 코드인 BBSList코드 수정

JSON 코드를 읽어서 리스트뷰에 뿌리는 함수 구현

![image](https://user-images.githubusercontent.com/55871387/85227837-b8c09680-b41a-11ea-9569-e632673b66b5.png)

6월 22일

로그인창에서 뒤로가기 버튼을 두번 눌렀을 때 종료하게끔 구현

<img src = "https://user-images.githubusercontent.com/55236612/85242798-f523df00-b47a-11ea-9029-f6ae0ff6a7c1.png"  width="300" height="600">

listview 클릭이벤트 시 게시물을 보여줄 activity_view 틀 생성

메인창에서 뒤로가기 버튼을 두번 눌렀을 때 종료하게끔 구현

<img src = "https://user-images.githubusercontent.com/55236612/85246469-ad568500-b485-11ea-9586-56cd2ffb5340.png"  width="300" height="600">

db의 BOARD 테이브에 있는 모든 내용들을 파싱해오는 함수 구현

<img src = "https://user-images.githubusercontent.com/55871387/85247344-661dc380-b488-11ea-815c-208d6c4dc126.jpg"  width="300" height="600">

viewactivity에서 각 listview에 대한 text(title,writer,date,content)가 보이게끔 구현 미완

viewactivity에서 게시물 아래 댓글창과 업로드 버튼, 좋아요 버튼 구현


<img src="https://user-images.githubusercontent.com/55236612/85291924-1ebe2400-b4d6-11ea-95ad-a969d9bc603e.png"  width="300" height="600">

댓글창과 업로드 버튼에 대한 실행 미완, 좋아요 버튼 카운트는 되나, 각 게시물에 대한 카운팅 저장은 안되고 앱을 나갔다 들어오면 초기화 됨

메뉴 디자인과 앱의 전체적인 디자인을 조금 바꿔봄

<img src="https://user-images.githubusercontent.com/54140431/85349495-8eb1c600-b539-11ea-9d9b-16b15e0e6bae.png"  width="300" height="600">

게시판에 있는 게시물 클릭시 DB에서 BBS_NO과 일치하는 게시물을 가져와 viewActivity에서 textview로 띄움.

post.php 파일을 서버에 추가함.

<img src="https://user-images.githubusercontent.com/55871387/85419038-8b0b5700-b5ac-11ea-9339-7ece3fd1d1f1.jpg"  width="300" height="600">

<img width="960" alt="post php 코드" src="https://user-images.githubusercontent.com/55871387/85419125-a5453500-b5ac-11ea-9c8d-7debda4b09bd.png">
