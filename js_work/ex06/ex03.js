const obj = {};

obj.a = 10;
obj.b = ()=>{
  console.log('obj.b');
}
console.log(obj);
console.log(obj.a);
console.log(obj.b);

obj.b();

/*
cls = 화면 깨끗하게
cd = 부모 디렉토리로
cd / = 루트 디렉토리로
node ex01.js = 실행
ls = 파일 리스트
*/