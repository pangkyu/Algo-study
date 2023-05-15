function solution(answers) {
  const answer = [];

  // 수포자들이 찍는 방식의 패턴(s1, s2, s3)과 채점표(score)를 각각 배열로 변환
  const s1 = [1, 2, 3, 4, 5];
  const s2 = [2, 1, 2, 3, 2, 4, 2, 5];
  const s3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  const score = [0, 0, 0];

  // 배열 answers가 주어졌을 때, 문제를 맞힌 횟수를 각각 채점해 score에 입력
  for (let i = 0; i < answers.length; i++) {
    if (s1[i % s1.length] === answers[i]) {
      score[0]++;
    }
    if (s2[i % s2.length] === answers[i]) {
      score[1]++;
    }
    if (s3[i % s3.length] === answers[i]) {
      score[2]++;
    }
  }

  // 채점 결과, 가장 많은 문제를 맞힌 사람을 배열에 담아 return
  const max = Math.max(...score);
  for (let j = 0; j < score.length; j++) {
    if (score[j] === max) {
      answer.push(j + 1);
    }
  }

  return answer;
}
