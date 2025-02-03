#!/bin/bash

for k in 0 1
do
  for policy in "p4f" "aac"
  do
    echo ""
    echo "k=$k  policy=$policy"
    echo "-----------------"
    for benchmark in $(cat benchmarks.txt)
    do
      ls $benchmark
      # 
      target/scala-3.5.2/native/org.ucombinator.cfa.RunCFA --kcfa --k $k --kalloc $policy $benchmark 2>&1
    done
  done
done

