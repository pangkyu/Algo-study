function solution(numbers) {
  const answer = new Set();

  for (let i = 1; i <= numbers.length; i++) {
    const permutation = [...getPermutation([...numbers], i)];
    const primeNumbers = permutation.filter((arr) => {
      const number = +arr.join("");
      const isPrimeNumber = checkPrimeNumber(number);
      return isPrimeNumber;
    });
    primeNumbers.forEach((arr) => {
      answer.add(+arr.join(""));
    });
  }
  return answer.size;
}

const checkPrimeNumber = (number) => {
  if (number < 2) return false;

  for (let i = 2; i <= Math.sqrt(number); i++) {
    const remainder = number % i;
    if (remainder === 0) return false;
  }
  return true;
};

const getPermutation = (arr, selectNumber) => {
  const results = [];
  if (selectNumber === 1) return arr.map((v) => [v]);
  else {
    arr.forEach((fixed, index, origin) => {
      const rest = [...origin.slice(0, index), ...origin.slice(index + 1)];
      const permutations = getPermutation(rest, selectNumber - 1);
      const attached = permutations.map((permutation) => [
        fixed,
        ...permutation,
      ]);
      results.push(...attached);
    });
  }

  return results;
};
