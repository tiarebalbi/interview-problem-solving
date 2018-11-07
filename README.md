# Interview Problem Solving

Sample Questions usually presented during interviews to check your problem solving skills. 

[![CircleCI](https://circleci.com/gh/tiarebalbi/interview-problem-solving.svg?style=svg)](https://circleci.com/gh/tiarebalbi/interview-problem-solving)
[![Maintainability](https://api.codeclimate.com/v1/badges/26736da8025b65f457f4/maintainability)](https://codeclimate.com/github/tiarebalbi/interview-problem-solving/maintainability)
---

## The Two Egg Problem

### A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.

If an egg is dropped from above that floor, it will break. If it is dropped from that floor or below, it will be completely undamaged and you can drop the egg again.
Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.

[Source Code](https://github.com/tiarebalbi/interview-problem-solving/blob/master/src/main/kotlin/com/tiarebalbi/interview/problem1/TwoEggProblem.kt)

#### Output:

    2018-11-07 08:01:21 INFO  TwoEggProblem:29 - Highest floor an egg won't break from: 13
    2018-11-07 08:01:21 INFO  TwoEggProblem:30 - Floors we drop first egg from: [50]
    2018-11-07 08:01:21 INFO  TwoEggProblem:31 - Floors we drop second egg from: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
    2018-11-07 08:01:21 INFO  TwoEggProblem:32 - Total number of drops: 13
    2018-11-07 08:01:21 INFO  TwoEggProblem:29 - Highest floor an egg won't break from: 98
    2018-11-07 08:01:21 INFO  TwoEggProblem:30 - Floors we drop first egg from: [50, 75, 88, 94, 97]
    2018-11-07 08:01:21 INFO  TwoEggProblem:31 - Floors we drop second egg from: []
    2018-11-07 08:01:21 INFO  TwoEggProblem:32 - Total number of drops: 5 

---
