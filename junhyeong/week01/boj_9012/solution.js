// 백준 9012번 괄호
// 분류 : 자료구조, 문자열, 스택
// https://www.acmicpc.net/problem/9012

const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

const T = Number(lines[0]);
const answer = [];

for (let i = 1; i <= T; i++) {
  const str = lines[i].trim();
  const stack = [];
  let toggle = true;

  for (let j = 0; j < str.length; j++) {
    if (str[j] === "(") stack.push(str[j]);
    else {
      if (stack.length === 0) {
        toggle = false;
        break;
      } else stack.pop();
    }
  }

  if (toggle && stack.length === 0) answer.push("YES");
  else answer.push("NO");
}

console.log(answer.join("\n"));
