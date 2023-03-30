// function solution(n, lost, reserve) {
//     let students = Array(n).fill(1); // n개 만큼 1로 기본세팅
//     for(let i = 1; i <= n; i++){
//         if(lost.indexOf(i) > -1) students[i-1] -= 1; // lost에 인덱스가 없으면 -1
//         if(reserve.indexOf(i) > -1) students[i-1] += 1;  // reserve에 인덱스가 있으면 +1
//     }
//     for (let [index, curr] of students.entries()) { // entries() -> 키 밸류 쌍의 새로운 array iterator 객체를 반환
//         // 아래 조건문은 앞 뒤 사람들이 1이상의 체육복이 있으면 받아올 수 있는 로직
//         if(curr === 0 && students[index+1] > 1){
//             students[index]++;
//             students[index+1]--;
//         }
//         if(curr === 0 && students[index-1] > 1){
//             students[index]++;
//             students[index-1]--;
//         }
//     }

//    return students.filter(el => el >= 1).length;
// }

// // // 17~20 , 25 실패

function solution(n, lost, reserve) {
  var answer = n - lost.length;
  // 처음 가능한 학생수 = n - lost.length
  // lost 배열 앞뒤의 값을 reserve에 포함되어있는지를 확인 -> 해당값을 reserve에서 뺌 + answer++
  // 왜 정렬을 해줘야 하지? - [4,2], [3,5]와 같은 케이스 때문

  let realLost = lost.filter((l) => !reserve.includes(l));
  let realReserve = reserve.filter((r) => !lost.includes(r));
  answer += lost.length - realLost.length;
  console.log(answer);

  realLost.sort((a, b) => a - b);

  realLost.forEach((l) => {
    if (realReserve.length === 0) {
      return;
    }

    if (realReserve.includes(l - 1)) {
      realReserve = realReserve.filter((r) => r !== l - 1);
      answer++;
    } else if (realReserve.includes(l + 1)) {
      realReserve = realReserve.filter((r) => r !== l + 1);
      answer++;
    }
  });
  return answer;
}
