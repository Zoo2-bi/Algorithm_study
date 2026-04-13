// 백준 2841번 외계인의 기타 연주
// 분류 : 자료구조, 스택
// https://www.acmicpc.net/problem/2841

const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

const N = lines[0].split(" ")[0];
const P = lines[0].split(" ")[1];
const stack = Array.from({ length: 7 }, () => []);

let answer = 0;

for (let i = 1; i <= N; i++) {
  const line = Number(lines[i].split(" ")[0]);
  const plat = Number(lines[i].split(" ")[1]);

  if (stack[line].length === 0 || plat > stack[line][stack[line].length - 1]) {
    stack[line].push(plat);
    answer++;
  } else if (plat === stack[line][stack[line].length - 1]) continue;
  else {
    while (stack[line].length !== 0 && plat < stack[line][stack[line].length - 1]) {
      stack[line].pop();
      answer++;
    }

    if (stack[line].length !== 0 && plat === stack[line][stack[line].length - 1]) continue;

    stack[line].push(plat);
    answer++;
  }
}

console.log(answer);
