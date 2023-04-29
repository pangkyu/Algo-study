function solution(bridge_length, weight, truck_weights) {
  let answer = 0;
  let sum = 0;
  const bridge = Array.from({ length: bridge_length }, (_) => 0); // 다리 길이만큼 0입력

  while (bridge.length > 0) {
    answer++;

    sum -= bridge.shift(); // shift() -> 배열에서 첫번째 요소를 제거하고 제거된 요소를 반환하는 함수

    if (truck_weights.length > 0) {
      if (sum + truck_weights[0] <= weight) {
        let truck = truck_weights.shift();
        sum += truck;
        bridge.push(truck);
      } else {
        bridge.push(0);
      }
    }
  }
  return answer;
}
