import React from "react";
import logo from "../html-css-template/imagens/logo-quadra.png";
import logoPessoa from "../html-css-template/imagens/logo-pessoa.png";

function PaginaCadastro() {
  return (
    <>
      <html lang="en">
        <head>
          <meta charset="UTF-8" />
          <meta http-equiv="X-UA-Compatible" content="IE=edge" />
          <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0"
          />
          <title>Cadastre-se</title>
          <link href="../css/style-cadastro.css " rel="stylesheet" />
          <link rel="preconnect" href="https://fonts.googleapis.com" />
          <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
          <link
            href="https://fonts.googleapis.com/css2?family=Spartan&display=swap"
            rel="stylesheet"
          />
          <link
            href="https://fonts.googleapis.com/css2?family=Spartan:wght@100;200;300;400;500;600;700;800;900&display=swap"
            rel="stylesheet"
          />
        </head>
        <body class="imagem-cadastro">
          <div class="header-cadastro">
            <img src={logo} alt="" />
          </div>

          <div class="container-cadastro">
            <div class="corpo-cadastro">
              <div class="components-logo-cadastro">
                <img src={logoPessoa} alt="" />
                <div class="components-leights-cadastro">
                  <h1>RESENHA</h1>
                </div>
                <div class="components-title">
                  <h1>
                    FAÇA SEU <b>CADASTRO</b> AGORA
                  </h1>
                </div>
                <div class="components-nome">
                  <p>NOME</p>
                </div>
                <div class="components-sobrenome">
                  <p>SOBRENOME</p>
                </div>
                <div class="components-email-cadastro">
                  <p>EMAIL</p>
                </div>
                <div class="components-senha-cadastro">
                  <p>SENHA</p>
                </div>
                <div class="components-confirmarSenha">
                  <p>CONFIRMAR SENHA</p>
                </div>
                <div class="components-cpf">
                  <p>CPF</p>
                </div>
                <div class="components-telefone">
                  <p>TELEFONE</p>
                </div>
                <div class="components-input-nome">
                  <input
                    type="input"
                    class="form__nome"
                    placeholder=""
                    name="nome"
                    id="nome"
                    required
                  />
                </div>
                <div class="components-input-sobrenome">
                  <input
                    type="input"
                    class="form__sobrenome"
                    placeholder=""
                    name="sobrenome"
                    id="sobrenome"
                    required
                  />
                </div>
                <div class="components-input-email-cadastro">
                  <input
                    type="input"
                    class="form__email_cadastro"
                    placeholder=""
                    name="email"
                    id="email"
                    required
                  />
                </div>
                <div class="components-input-senha-cadastro">
                  <input
                    type="password"
                    class="form__senha_cadastro"
                    placeholder=""
                    name="nome"
                    id="nome"
                    required
                  />
                </div>
                <div class="components-input-confirmarSenha">
                  <input
                    type="password"
                    class="form__confirmarSenha"
                    placeholder=""
                    name="nome"
                    id="nome"
                    required
                  />
                </div>
                <div class="components-input-cpf">
                  <input
                    type="number"
                    class="form__cpf"
                    placeholder=""
                    name="nome"
                    id="nome"
                    required
                  />
                </div>
                <div class="components-input-telefone">
                  <input
                    type="number"
                    class="form__telefone"
                    placeholder=""
                    name="nome"
                    id="nome"
                    required
                  />
                </div>
                <div class="cadastro-form-sendbutton">
                  <button>CRIAR CONTA</button>
                </div>
              </div>
            </div>
          </div>
        </body>
      </html>
    </>
  );
}
export default PaginaCadastro;
