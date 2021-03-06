# codekata-02-karatechop
Exercising the "Karate Chop" code kata by Dave Thomas that can be found [here](http://codekata.com/kata/kata02-karate-chop/) in a little different version.

## Kata02: Karate Chop
A [...] chop (sometimes called the more prosaic [...] search) finds the position of value in a sorted array of values. It achieves some efficiency by halving the number of items under consideration each time it probes the values: in the first pass it determines whether the required value is in the top or the bottom half of the list of values. In the second pass in considers only this half, again dividing it in to two. It stops when it finds the value it is looking for, or when it runs out of array to search. [...] searches are a favorite of CS lecturers.

## Goals
This Kata has three separate goals:

1. As you’re coding each algorithm, keep a note of the kinds of error you encounter. A [...] search is a ripe breeding ground for “off by one” and fencepost errors. As you progress through the week, see if the frequency of these errors decreases (that is, do you learn from experience in one technique when it comes to coding with a different technique?).

2. What can you say about the relative merits of the various techniques you’ve chosen? Which is the most likely to make it in to production code? Which was the most fun to write? Which was the hardest to get working? And for all these questions, ask yourself “why?”.

3. It’s fairly hard to come up with five unique approaches to a [...] chop. How did you go about coming up with approaches four and five? What techniques did you use to fire those “off the wall” neurons?

## Specification
Write a [...] chop method that takes an integer search target and a sorted array of integers. It should return the integer index of the target in the array, or -1 if the target is not in the array. The signature will logically be:

```
chop(int, array_of_int)  -> int
```

Kata02, Goals and Specification taken from http://codekata.com/kata/kata02-karate-chop/, Dave Thomas (@PragDave), Nov 04th, 2016
