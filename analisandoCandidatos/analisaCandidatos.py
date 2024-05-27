import tkinter as tk
from tkinter import messagebox

def analisar_candidato():
    nome = entry_nome.get()
    experiencia = entry_experiencia.get()
    salario = entry_salario.get()

    if nome and experiencia and salario:
        # análise com os valores coletados
        # mensagem com os valores inseridos
        mensagem = f"Nome: {nome}\nExperiência: {experiencia} anos\nSalário Pretendido: R${salario}"
        messagebox.showinfo("Análise do Candidato", mensagem)
    else:
        messagebox.showwarning("Atenção", "Por favor, preencha todos os campos.")

# janela principal
root = tk.Tk()
root.title("Análise de Candidato")

# posiciona os widgets na janela
label_nome = tk.Label(root, text="Nome:")
label_nome.grid(row=0, column=0, sticky="e")
entry_nome = tk.Entry(root)
entry_nome.grid(row=0, column=1)

label_experiencia = tk.Label(root, text="Experiência (anos):")
label_experiencia.grid(row=1, column=0, sticky="e")
entry_experiencia = tk.Entry(root)
entry_experiencia.grid(row=1, column=1)

label_salario = tk.Label(root, text="Salário Pretendido (R$):")
label_salario.grid(row=2, column=0, sticky="e")
entry_salario = tk.Entry(root)
entry_salario.grid(row=2, column=1)

button_analisar = tk.Button(root, text="Analisar Candidato", command=analisar_candidato)
button_analisar.grid(row=3, columnspan=2)

# loop
root.mainloop()
