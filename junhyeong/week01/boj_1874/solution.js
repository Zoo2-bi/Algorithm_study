// 백준 1874번 스택 수열
// 분류 : 자료구조, 스택
// https://www.acmicpc.net/problem/1874

const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

const n = Number(lines[0]);
const stack = [];
let answer = [];
let pointer = 1;
let isValid = true;

for (let i = 1; i <= n; i++) {
  const number = Number(lines[i].trim());

  if (!stack.includes(number)) {
    for (let j = pointer; j <= number; j++) {
      stack.push(j);
      answer.push("+");
      pointer++;
    }
    stack.pop();
    answer.push("-");
  } else {
    if (stack[stack.length - 1] === number) {
      stack.pop();
      answer.push("-");
    } else {
      isValid = false;
      break;
    }
  }
}

if (isValid) console.log(answer.join("\n"));
else console.log("NO");
