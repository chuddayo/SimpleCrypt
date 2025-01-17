# SimpleCrypt
a simple set of crypt problems.

### Part 1
Create a few ciphers. Use String inside of your classes.

* cipher.ROT13 - take the 26 letters of the alphabet and create a `String <- crypt(String)` method in the cipher.ROT13 class
  * crypt("Why did the chicken cross the road?") should produce "Jul qvq gur puvpxra pebff gur ebnq?"
  * crypt("Gb trg gb gur bgure fvqr!") should produce "To get to the other side!"
* Make a constructor that takes two arguments to set the cipher correspondence. `cipher.ROT13 superSecure = new cipher.ROT13("a","m");`
  * this defines the SHIFT of the two Character arrays.
* Caesar - make a subclass of cipher.ROT13 that implements the famous caesar cipher.
* Create you own cipher, using a different set of 

### Part 2

Make a method that reads a textfile (sonnet18.txt), encrypts it, and writes it back out to a different file (sonnet18.enc)
Prove that when you read in (sonnet18.enc), run the same crypt again, and prove that it produces the same original text.

## Explanation

cipher.ROT13 ("rotate by 13 places", sometimes hyphenated ROT-13) is a simple letter substitution cipher that replaces a letter with the 13th letter after it, in the alphabet. cipher.ROT13 is a special case of the Caesar cipher, developed in ancient Rome.

Because there are 26 letters (2×13) in the basic Latin alphabet, cipher.ROT13 is its own inverse; that is, to undo cipher.ROT13, the same algorithm is applied, so the same action can be used for encoding and decoding. The algorithm provides virtually no cryptographic security, and is often cited as a canonical example of weak encryption.

cipher.ROT13 is used in online forums as a means of hiding spoilers, punchlines, puzzle solutions, and offensive materials from the casual glance. cipher.ROT13 has been described as the "Usenet equivalent of a magazine printing the answer to a quiz upside down".[2] cipher.ROT13 has inspired a variety of letter and word games on-line, and is frequently mentioned in newsgroup conversations.

Applying cipher.ROT13 to a piece of text merely requires examining its alphabetic characters and replacing each one by the letter 13 places further along in the alphabet, wrapping back to the beginning if necessary.[3] A becomes N, B becomes O, and so on up to M, which becomes Z, then the sequence continues at the beginning of the alphabet: N becomes A, O becomes B, and so on to Z, which becomes M. Only those letters which occur in the English alphabet are affected; numbers, symbols, whitespace, and all other characters are left unchanged.

```Java
String s = "we hold these truths to be self evident";

//WHEN you create a cipher.ROT13 with 'a' and 'n' THEN 

if (crypt(crypt(s)) == s) {
  return true;
}

//if anything else, you must use the encrypt/decrypt pair.
```
In other words, two successive applications of cipher.ROT13 restore the original text (in mathematics, this is sometimes called an involution; in cryptography, a reciprocal cipher).

The transformation can be done using a lookup table, such as the following:

```
// for cipher.ROT13('a', 'n')
Input	ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz
Output	NOPQRSTUVWXYZABCDEFGHIJKLM nopqrstuvwxyzabcdefghijklm

// for cipher.ROT13('a', 'd')
Input	ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz
Output	DEFGHIJKLMNOPQRSTUVWXYZABC defghijklmnopqrstuvwxyzabc
```
For example, in the following joke, the punchline has been obscured by cipher.ROT13:

```
Why did the chicken cross the road?
Gb trg gb gur bgure fvqr!
```
Transforming the entire text via cipher.ROT13 form, the answer to the joke is revealed:
```
Jul qvq gur puvpxra pebff gur ebnq?
To get to the other side!
```

