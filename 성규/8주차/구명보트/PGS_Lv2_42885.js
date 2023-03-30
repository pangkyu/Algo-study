function solution(people, limit) {
  let count = 0;
  people.sort((a, b) => a - b);

  // 가장 무거운 사람 , 가장 가벼운 사람이 함께 탈 수 있는지 검사
  for (let i = 0, j = people.length - 1; i <= j; j--) {
    if (people[i] + people[j] <= limit) {
      count++;
      i++;
    } else {
      count++; // 아니면 무거운사람 먼저 보트 탑승
    }
  }
  return count;
}
