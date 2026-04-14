// 백준 10773번 제로
// 분류 : 자료구조, 문자열, 스택
// https://www.acmicpc.net/problem/10773

const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

const K = Number(lines[0]);
const stack = [];
let sum = 0;

for (let i = 1; i <= K; i++) {
  const price = Number(lines[i].trim());

  if (price !== 0) stack.push(price);
  else stack.pop();
}

for (let j = 0; j < stack.length; j++) {
  sum += stack[j];
}

console.log(sum);
