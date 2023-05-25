// 점화식으로 문제 풀이
// 1칸뛸때는 1가지 경우, 2칸뛸때는 2가지 경우 (1칸+1칸)
// 3칸 => 2칸뛰는경우 + 1칸뛰는경우
// jump[i] = jump[i-1] + jump[i-2]

function solution(n) {
  let jump = new Array(n + 1).fill(0);
  jump[1] = 1;
  jump[2] = 2;
  for (let i = 3; i <= n; i++) {
    jump[i] = (jump[i - 2] + jump[i - 1]) % 1234567;
  }
  return jump[n];
}
