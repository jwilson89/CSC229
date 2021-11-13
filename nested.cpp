#include<iostream>
int main()
{





	for (int outer = 1; outer <= 5; outer++)
	{

		std::cout << "Table of outer is: " << outer << std::endl;
		for (int inner = 1; inner <=  2; inner++)
		{

			std::cout << "Table of inner is: " << inner << std::endl;

			for (int super_inner = 1; super_inner <= 100; super_inner++)
			{
				std::cout << "(outer)"<< outer << " *(inner)" << inner << " * "<< "(super_inner) "<<super_inner << " = "<< (outer * inner * super_inner) << std::endl;
			}
		}
	}
	return 0;



	
}
