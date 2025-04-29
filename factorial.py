def factorial(num):
    if num < 0:
        print("Factorial is not defined for negative numbers.")
        return -1
    elif num == 0 or num == 1:
        return 1
    else:
        return num * factorial(num - 1)
    
def main():
    num = int(input("Enter a number to calculate its factorial: "))
    result = factorial(num)
    if result != -1:
        print(f"The factorial of {num}! is {result}.")

if __name__ == "__main__":
    main()