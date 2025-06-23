def find_best_position(rows, cols, grid):
    # Membalik grid secara manual agar titik (0,0) ada di kiri bawah
    flipped_grid = [grid[rows - 1 - i] for i in range(rows)]
    
    # Menghitung jumlah asteroid per baris dan per kolom
    row_sums = [sum(row) for row in flipped_grid]
    col_sums = [sum(flipped_grid[r][c] for r in range(rows)) for c in range(cols)]
    
    max_asteroids = -1  # Menyimpan jumlah asteroid maksimum yang bisa dihancurkan
    best_row, best_col = None, None  # Menyimpan koordinat terbaik

    # Iterasi untuk mencari posisi terbaik
    for r in range(rows):
        for c in range(cols):
            # Menghitung total asteroid yang bisa dihancurkan jika menembak di (r, c)
            destroyed_asteroids = row_sums[r] + col_sums[c] - flipped_grid[r][c]
            
            # Memilih koordinat terbaik berdasarkan jumlah asteroid yang dihancurkan
            if destroyed_asteroids > max_asteroids:
                max_asteroids = destroyed_asteroids
                best_row, best_col = r, c
            elif destroyed_asteroids == max_asteroids:
                if r < best_row or (r == best_row and c < best_col):
                    best_row, best_col = r, c

    # Konversi koordinat ke format output yang diminta
    output_x = best_col  # x dihitung dari kiri ke kanan
    output_y = best_row  # y dihitung dari bawah ke atas
    
    print(output_x, output_y, max_asteroids)


# Input data dari pengguna
N, M = map(int, input().split())  # Membaca jumlah baris dan kolom
LS = [list(map(int, input().split())) for _ in range(N)]  # Membaca matriks

# Menjalankan fungsi
find_best_position(N, M, LS)
