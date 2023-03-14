function solution(word) {
  const vowels = ["A", "E", "I", "O", "U"];
  const wordArray = [];
  const makeWordArray = (onword) => {
    if (onword.length === 5) return;

    for (let i = 0; i < 5; i++) {
      const currentWord = onword + vowels[i];
      wordArray.push(currentWord);
      makeWordArray(currentWord);
    }
  };
  makeWordArray("");

  return wordArray.indexOf(word) + 1;
}
