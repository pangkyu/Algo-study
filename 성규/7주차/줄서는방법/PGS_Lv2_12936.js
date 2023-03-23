function solution(n, k) {
  const answer = [];
  const people = Array.from({ length: n }, (_, i) => i + 1); // n번까지 번호가 매겨져있으므로 i+1을 하면서 n번까지 어레이에 값을 할당한다

  let caseNum = people.reduce((ac, v) => ac * v); // reduce를 통해 n!의 값을 구하는 과정

  while (answer.length < n) {
    caseNum = caseNum / people.length;
    answer.push(...people.splice(Math.floor((k - 1) / caseNum), 1)); // 몇번째 방법인지 나타내지만 1부터 시작하므로 index를 맞추기 위해 k-1을 함
    k = k % caseNum; // 현재 넣을 자리에 들어갈 숫자를 제외하고 남은 사람을 줄 세우는 방법 중 몇번째인지에 대한 값
  }

  return answer;
}
