## 🧩 문제 정보

- 플랫폼: BOJ
- 문제 번호: 3986
- 문제 이름: 좋은
- 분류 : 자료구조, 스택
- 링크: https://www.acmicpc.net/problem/3986

---

## 💡 문제 설명

- 문제에 대한 간단한 요약 (내가 이 문제를 얼마나 파악하고 있는지 확인)

- 여기서 단어란 행에 있는 문자열을 의미
- 하나의 문자열을 스택으로 보고, 차례대로 추출하여 만약 같은 문자끼리 만나면 해당 문자쌍 제거
- 스택의 모든 요소들을 추출했을때 모든 문자들이 제거되었다면 좋은 단어 O, 그렇지 않다면 좋은 단어 X

---

## 🚀 접근 방법

#### 어떤 방식으로 접근했는지

- 틀린 방법
  - 각 행의 문자열을 하나의 스택으로 인식
  - 스택의 요소들을 차례로 추출하여 배열에 삽입
  - 배열에 삽입하기 전에 배열의 가장 끝부분의 요소와 같은 경우, 삽입하지 않고 추출한 문자와 배열의 끝부분 요소를 삭제

- 올바른 방법
  - 단어는 데이터를 읽어오는 참고용 데이터
  - stack 배열을 생성
    1. stack에 push하는 경우
       - stack 배열이 비어있거나 문자가 stack의 top과 다르면 push
       - 이는 해당 문자가 바로옆의 문자와 다를 때 잠시 보류하는 경우
       - 보류 시 stack으로 옮겨지고, 추후 일치 하는 문자열이 있는 경우에 pop
    2. stack을 pop하는 경우
       - stack 배열이 비어있지않고 문자가 stack의 top과 같으면 pop
       - 이는 해당 문자가 바로옆의 문자와 쌍을 이루는 경우
- 모든 문자는 stack 담기므로, 반복문을 돌린 후 stack 배열이 비어있다면 좋은 단어

#### 핵심 로직

- 틀린 방법
  - 문자열의 행 수 만큼 반복문 진행
  - 각 행의 문자열을 스택1로 인식 및 추출한 문자들을 저장하는 스택2를 생성
  - 스택1의 top값과 스택2의 top값이 같다면 삽입하지 않고 두 값을 제거
  - 스택1의 top값과 스택2의 top값이 같지 않다면 삽입

- 올바른 방법
  - 문자열은 읽어오는 용도
  - stack 배열을 생성하여 stack이 비어있거나 문자열과 stack의 top이 같지 않으면 해당 값 push
  - stack의 값이 존재하면서 문자열과 stack top이 같으면 pop

---

## ⏱️ 시간 복잡도

- 시간: O( n )
  - for문을 1번 돌리므로 n
- 공간: O( )

---

## 🌅 느낀 점

### 배운 점

### 아쉬운 점

```js
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const lines = fs.readFileSync(filePath).toString().trim().split("\n");

const n = lines[0];
let answer = 0;

for (let i = 1; i <= n; i++) {
  const stack = lines[i].trim().split("");
  const temp = [];

  temp.push(stack.pop());

  while (stack.length !== 0) {
    if (stack[stack.length - 1] === temp[temp.length - 1]) {
      stack.pop();
      temp.pop();
    } else {
      temp.push(stack.pop());
    }
  }

  if (temp.length === 0) answer++;
}

console.log(answer);
```

- 해당 코드는 "ABA"와 같이 에러가 발생하는 버그에서 깨짐
- 스택을 2개를 사용하여 공간복잡도가 증가

### 개선 포인트

- 스택을 1개만 사용
- 문제에서 처리하는 경우를 로직에서 과정과 일대일 대응
