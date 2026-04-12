// 백준 3986번 좋은 단어
// 분류 : 자료구조, 스택
// https://www.acmicpc.net/problem/10828

const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

const n = lines[0];
let answer = 0;

for (let i = 1; i <= n; i++) {
  const word = lines[i].trim().split("");
  console.log(word);
  const stack = [];

  for (let j = 0; j < word.length; j++) {
    if (stack[stack.length - 1] === word[j] && stack.length === 0) {
      stack.pop();
    } else {
      stack.push(word[j]);
    }
  }

  if (stack.length === 0) answer++;
}

console.log(answer);
