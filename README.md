# Số Nguyên tố
Số nguyên tố là số tự nhiên chỉ có các ước số là 1 và chính nó. Các số có nhiều hơn 2 ước số được gọi là hợp số. Do 1 chỉ có 1 ước số là chính nó, nên 1 không phải là số nguyên tố và cũng không phải là hợp số.

+ [Tham khảo số nguyên tố](https://vi.wikipedia.org/wiki/S%E1%BB%91_nguy%C3%AAn_t%E1%BB%91)
+ [Tham khảo thêm cách cài đặt số nguyên tố tại đây](http://daynhauhoc.com/t/wiki-ham-ki-m-tra-s-nguyen-t-trong-c-c/2171)

##Bài toán Số Nguyên tố
+ Nhập và Hiển thị mảng a từ bàn phím
+ Kiểm tra các số trong mảng a có phải là số nguyên tố không? Nếu là số nguyên tố thì hiển thị ngoài màn hình

```
boolean isNguyenTo(int x)
    {
      if(x<2)  //cac so nho hon 2 khong phai la so nguyen to
          return false; 
      
      for(int i=2; i<=Math.sqrt((float)x); i++)
          if(x%i==0)
              return false;
      
      return true;
    }
```

