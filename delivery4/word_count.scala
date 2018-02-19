val f = sc.textFile("/hduser/input/pg2000.txt")
val wc = f.flatMap(l => l.split(" ")).
           map(word => (word, 1)).
           reduceByKey(_ + _)
wc.saveAsTextFile("/hduser/spark/wc_scala_out")
