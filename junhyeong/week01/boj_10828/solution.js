// 백준 10828번 스택
// 분류 : 구현, 자료구조, 스택
// https://www.acmicpc.net/problem/10828

const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

/* 출력 방식 개선 전 */

// const n = Number(lines[0]);
// const arr = [];

// for (let i = 1; i <= n; i++) {
//   const command = lines[i].trim().split(" ");

//   switch (command[0]) {
//     case "push":
//       arr.push(command[1]);
//       break;

//     case "pop":
//       if (arr.length === 0) console.log(-1);
//       else console.log(arr[arr.length - 1]);
//       arr.pop(command[1]);
//       break;

//     case "size":
//       console.log(arr.length);
//       break;

//     case "empty":
//       if (arr.length === 0) console.log(1);
//       else console.log(0);
//       break;

//     case "top":
//       if (arr.length === 0) console.log(-1);
//       else console.log(arr[arr.length - 1]);
//       break;
//   }
// }

/* 출력 방식 개선 후 */

const n = Number(lines[0]);
const arr = [];
const answer = [];

for (let i = 1; i <= n; i++) {
  const command = lines[i].trim().split(" ");

  switch (command[0]) {
    case "push":
      arr.push(command[1]);
      break;

    case "pop":
      if (arr.length === 0) answer.push(-1);
      else answer.push(arr.pop(command[1]));
      break;

    case "size":
      answer.push(arr.length);
      break;

    case "empty":
      if (arr.length === 0) answer.push(1);
      else answer.push(0);
      break;

    case "top":
      if (arr.length === 0) answer.push(-1);
      else answer.push(arr[arr.length - 1]);
      break;
  }
}

console.log(answer.join("\n"));
