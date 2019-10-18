### 软件分析测试第二次作业
*dz1933028 王洋*
---
	ubuntu18.04
	clang 6.0
---
```C
#include<stdio.h>

int main(void){
	
	for(int i=0;i<10;i++){
		int j=i+3;
	}
}
```
源代码hw.c如上所示，经过命令
`clang -S -o hw.ll hw.c`
得到中间表示hw.ll，如下图所示：
<br/>
![](https://github.com/NJUocean/STA/blob/master/SSA.png?raw=true)
<br/>
可以看到被黑框圈出来的%2地址被store语句写入两次，所以是部分SSA
