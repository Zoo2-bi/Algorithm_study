// 백준 10799번 쇠막대기
// 분류 : 자료구조, 스택
// https://www.acmicpc.net/problem/10799

const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

const bar = lines[0].split("");
const stack = [];
let answer = 0;
let prev = "";

for (let i = 0; i < bar.length; i++) {
  if (i > 0) prev = bar[i - 1];

  if (bar[i] === "(") stack.push(bar[i]);
  else {
    if (prev === "(") {
      stack.pop();
      answer += stack.length;
    } else {
      stack.pop();
      answer += 1;
    }
  }
}

console.log(answer);
