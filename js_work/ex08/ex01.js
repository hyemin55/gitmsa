import readline from "readline";

const myobj = {
  input: process.stdin,
  output: process.stdout,
};

const r1 = readline.createInterface(myobj);

let num1;
let num2;

r1.question("num1 입력", (res) => {
  console.log(`res = ${res}`);
  num1 = Number(res);

  r1.question("num2 입력", (res) => {
    console.log(`res = ${res}`);
    num2 = Number(res);

    r1.close();
    console.log(`${num1}+${num2} = ${num1 + num2}`);
  });
});
