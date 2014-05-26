TMethodDemo4
============
單純的設兩個陣列,一個是用來輸入和儲存數值,另一個是列出數值
另外要注意的是 有用到 new BufferedReader(new InputStreamReader(System.in));
和 throws IOException 才能讓命令視窗可以輸入數字
如果輸入的不是數字,有用 Integer.parseInt(str); 去做轉型

另外 有用一個方法aMethod去做加10的動作
