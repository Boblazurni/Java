// Файл для Задания 4: Класс MathFunc
public class MathFunc implements MathCalculable {
    
    @Override
    public double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        return exponent >= 0 ? result : 1 / result;
    }
    
    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
    
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
    
    public double circleArea(double radius) {
        return PI * power(radius, 2);
    }
}