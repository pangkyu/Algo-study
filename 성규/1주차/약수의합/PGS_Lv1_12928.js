/**
 *  약수의 합 - 프로그래머스 
 *  
    문제 설명
    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

    제한 사항
     n은 0 이상 3000이하인 정수입니다.

 */

function solution(n) {
  var answer = 0;
  let i = 1;
  for (i; i <= n; i++) {
    if (n % i === 0) {
      answer += i;
    } else {
      continue;
    }
  }
  return answer;
}

// 다른사람 풀이

// function solution(n) {
//   var answer = 0;
//   let i;
//   for (i = 1; i <= Math.sqrt(n); i++){
//       if (!(n%i)) {
//           answer += (i+n/i);
//       }
//   }
//   i--;
//   return (i === n/i) ? answer-i : answer;
// }

// 다음과 같은 로직으로 짜면 계산량을 효과적으로 줄일 수 있음!
