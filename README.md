Avengers Infinity Code
-----------------------------------------------------

As you know Loki has opened Earth to a new dimension and He wants to rule The Earth, But the Avengers are trying to save the Earth by destroying the portal to new Dimension.
To close the new dimension portal `Iron man` has to generate a positive Energy in form of Electricity say `E` which can be only digital i.e contains `'1's` and `'0's`.
As Iron man suit energy is low on power he has to generate the minimum energy required to destroy the portal to another dimension which have a protective field `F`.
The energy generated `E` should be a divisible by the field of the portal `F` , so say if the field of the portal is `17` than iron man have to
generate minimum digital(0's & 1's) electric energy which is divisible by `17` i.e `11101`.

As you are Jarvis you need to calculate the minimum energy to generate for destroying the portal to new dimension.
Jarvis, Please save the world.

Problem
-----------------------------------------
Jarvis already implemented some code but as Jarvis is not a human so the code written by Jarvis is not extendable.
So, our aim is to make it more extendable and help Avenger to destroy other portal as well.   

*For Reference code for getting energy and fire Blaster is* 
```
val command = "DESTROY PORTAL"
val fieldValue = 14
val energy = Jarvis()
    .help(command,fieldValue)
    .execute()

Blaster.fire(energy)
```

Input
`47`

Output
`10011`

Extension Dimension 1
-----------------------------------------

Loki saw that the Avengers are able to destroy the first portal . So Loki decide to make one more portal which can only expect "9" and "0".
Modify your code to counter new Portal.

```

val command = "DESTROY PORTAL 2"
val fieldValue = 14
val energy = Jarvis()
            .help(command,fieldValue)
            .execute()

Blaster().fire(energy)

```

Input `59`

Output `99099999`

Extension Dimension 2
------------------------------------------
The third portal made by Loki is a powerful one and its even harder to destroy. Loki has found that the
portal destroyed by Iron man was destroyed by a very powerful blaster with energy value more than the portal. So, loki designed the
new portal in such a way that the energy required to destroy the new dimension portal will be less. 
But its not that straight forward and there are some rules needed to be followed by Jarvis to determine the exact energy value to destroy the new portal.
So, if the portal field value is `F` than Jarvis has to find out count of all the numbers formed by `1` and `0` that is less
than the portal field.

So if the portal field is `103` the energy required to destroy the portal is `7`.

Example:  
Input `103`

Output `7`

Explanation:
All the number formed by `0` and `1` less than 103 are
`1, 10, 11, 110, 101, 100, 111`


*GO, AVENGERS !!* 

Hint
------------------------------------------
Do not think on optimizations first try to make it extendable.  
  

