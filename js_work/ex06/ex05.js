const doA = (a,b=20, c='A10')=>{
  console.log(`a = ${a}`);
  console.log(`b = ${b}`);
  console.log(`c = ${c}`);
}
doA();

const doB = (a,b, c)=>{
  console.log(`a = ${a}`);
  console.log(`b = ${b}`);
  console.log(`c = ${c}`);
}
doB(`글자`,20,"@#!$@!");

function doC(){ }
  const doD = function(){ } //여기에서 this onclick
  const doE = ()=>{ }