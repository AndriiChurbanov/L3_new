import org.example.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testAddMatrices() {
        int[][] matrix1 = {
                {5, 12},
                {14, 9}
        };

        int[][] matrix2 = {
                {15, 3},
                {18, 21}
        };

        int[][] expected = {
                {20, 15},
                {32, 30}
        };

        int[][] result = Main.addMatrices(matrix1, matrix2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testMultiplyMatrices() {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };

        int[][] expected = {
                {19, 22},
                {43, 50}
        };

        int[][] result = Main.multiplyMatrices(matrix1, matrix2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testAddMatricesWithDifferentDimensions() {
        int[][] matrix1 = {
                {9, 6},
                {13, 11}
        };

        int[][] matrix2 = {
                {8, 3, 16},
                {25, 21, 14}
        };

        // Очікується виняток, оскільки матриці мають різний розмір
        assertThrows(IllegalArgumentException.class, () -> Main.addMatrices(matrix1, matrix2));
    }

    @Test
    void testMultiplyMatricesWithInvalidDimensions() {
        int[][] matrix1 = {
                {4, 1},
                {1, 9}
        };

        int[][] matrix2 = {
                {6, 16, 22},
                {18, 22, 10}
        };

        // Очікується виняток, оскільки матриці не можна перемножити через невідповідність розмірів
        assertThrows(IllegalArgumentException.class, () -> Main.multiplyMatrices(matrix1, matrix2));
    }
}
