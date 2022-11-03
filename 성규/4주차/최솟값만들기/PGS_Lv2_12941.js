/**
 * 문제 설명
길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)

예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면

A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)
즉, 이 경우가 최소가 되므로 29를 return 합니다.

배열 A, B가 주어질 때 최종적으로 누적된 최솟값을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 A, B의 크기 : 1,000 이하의 자연수
배열 A, B의 원소의 크기 : 1,000 이하의 자연수
 */
let answer = 0;

A.sort((a, b) => a - b);
B.sort((a, b) => b - a);

for (let i = 0; i < A.length; i++) {
  answer = answer + A[i] * B[i];
}

return answer;

/* 
기존에 내가 풀었던 방식 
값은 잘나오는데 시간초과 이슈로 계속 통과가 안됨
근데 위에 공식이랑 로직자체가 비슷하다고 생각하는 데 왜 시간초과가 나버리는지 모르겠음.. 

위 값 시간초 => 0.2ms 정도 걸림
아래 값 시간초 => 3ms 정도 걸림
++ 큰값 순서 * 작은값 순서 로 곱해야 가장 낮은 값이 나온다는 점을 몰랐다.
*/

const splitA = A.sort();
const splitB = B.sort((a, b) => {
  return b - a;
});
console.log(splitB);
let multiOfSum = 0;
let multi = [];
let firstNumber = 0;
for (let i = 0; i < A.length; i++) {
  multi[i] = firstNumber + splitA[i] * splitB[i];
  multiOfSum += multi[i];
}
return multiOfSum;
