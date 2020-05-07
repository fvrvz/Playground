#include<iostream>
using namespace std;
int main()
{
  int x1, x2, x3, y1, y2, y3; //other's houses
  
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
 
  float x = (float(x1) + float(x2) + float(x3)) / 3; 
  float y = (float(y1) + float(y2) + float(y3)) / 3; 
  
  cout << x << "\n" << y;  
 
}