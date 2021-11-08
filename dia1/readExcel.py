import pandas as pd

# Esto es en local
# df = pd.read_excel("/Users/laiahidalgo/Desktop/openbootcamp/retos/dia1/readExcel.xlsx")

rutaFichero = input("Introduce la ruta completa del fichero Excel: ")
df = pd.read_excel(rutaFichero)

print(df.email)