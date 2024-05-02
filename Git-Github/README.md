# DIO | RESUMOS Git e GitHub
Resumos sobre o armazenamento no Git e GitHub do curso Versionamento de Código com Git e GitHub
da [Digital Innovation One](https://www.dio.me/).

## 📂 Documentação
- [Documentação Git](https://git-scm.com/doc)
- [Documentação GitHub](https://docs.github.com)

## 🖥️ Resumo das Aulas
| Aulas | Resumos |
|-------|---------|
| git config --global user.name "Seu Nome" | configura nome |
| git config --global user.email "seu-email@example.com" | configura email |
| git init | inicia repositorio |
| git clone url_do_repositorio | clona repositorio existente |
| git add nome_do_arquivo | adiciona arquivo ao staged area |
| git add . | add todos arquivos ao stage |
| git commit -m "Mensagem do commit" | cria um commit |
| git branch nome_do_branch | cria nova branch |
| git branch | lista branch existentes |
| git checkout nome_do_branch | muda p branch específico |
| git checkout -b novo_branch | cria branch e muda pra ele |
| git merge nome_do_branch | mescla branch na brach atual |
| git branch -d nome_do_branch | apaga branch |
| git remote add nome_remoto url_do_repositorio | adicionaa repositório remoto |
| git push nome_remoto nome_do_branch | envia commits p repositório |
| git pull nome_remoto nome_do_branch | atualiza repositório com alterações do remoto |
| git status | mostra status dos arquivos |
| git log | mostra status dos commits |
| git log --oneline | mostra histórico de commits |
| git reset --soft HEAD~[número de commits a remover] | mantém alterações nos arquivos |
| git reset --mixed HEAD~[número de commits a remover] | ´´ sem staged área |
| git reset --hard HEAD~[número de commits a remover] | remove completamente as alterações |
| git revert HEAD~[número de commits a reverter]..HEAD | apaga commits já enviados ao rep |

```
git init

```

## 📡 Referências
- ([Digital innovation one](https://app.santanderopenacademy.com/)).
