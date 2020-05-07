#include<iostream>
using namespace std;
int main()
{
  int a, b, c;
  
  std::cin>>a>>b>>c;
  
  //finding 2nd largest number
  if(a>b&&a>c){
	if(b>c){
	std::cout<<"The treasure is in box which has number "<<b<<std::endl;
    }
	else{
	std::cout<<"The treasure is in box which has number "<<c<<std::endl;
    }
  }

  if(b>a&&b>c){
	if(a>c){
	std::cout<<"The treasure is in box which has number "<<a<<std::endl;
    }
	else{
	std::cout<<"The treasure is in box which has number "<<c<<std::endl;
    }
  }

  if(c>a&&c>b){
	if(b>a){
	std::cout<<"The treasure is in box which has number "<<b<<std::endl;
    }
	else{
	std::cout<<"The treasure is in box which has number "<<a<<std::endl;
    }
  }

  //finding largest divisible number
  if(a % a == 0 && b % a == 0){
    std::cout<<"The code to open the box is "<<a;
  }
  else if(a % b == 0 && b % b == 0){
    std::cout<<"The code to open the box is "<<b;
  }
  else if(a % c == 0 && c % c == 0){
    std::cout<<"The code to open the box is "<<c;
  }
  else{
    std::cout<<"The code to open the box is 1";
  }
}