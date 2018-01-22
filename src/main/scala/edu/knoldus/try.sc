val c=List(1,2,3,4,5)
def update(a:Int):Int = {println(a); a+5}
for{
 a <- c
 if (a > 3)
 n = update(a)
} yield n

val l1=List(1,2,3)
val l2=List(4,5,56)
l1.flatMap(x =>{l2.map(y=>x+y)})

l1.map(x=>{l2.map(y=>x+y)})
for(x <- 0 until l1.length )
 yield l1(x) + l2(x)
res3.toList

for(x<-l1
 y<-l2)
yield x+y