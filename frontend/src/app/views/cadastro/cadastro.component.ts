import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.scss']
})
export class CadastroComponent implements OnInit {
  cadastroForm: FormGroup;

  constructor(
    public formBuilder: FormBuilder,
  ) { }

  ngOnInit(): void {
    this.construirForm();
  }

  construirForm() {
    this.cadastroForm = this.formBuilder.group({
      nome: ['', [Validators.required]],
      email: ['', [Validators.email, Validators.required]],
      telefone: ['', [Validators.required]],
      cnpj: ['', [Validators.nullValidator]],
      cpf: ['', [Validators.required]],
      enderecoRua: ['', [Validators.required]],
      enderecoNumero: ['', [Validators.nullValidator]],
      enderecoBairro: ['', [Validators.required]],
      enderecoCidade: ['', [Validators.required]],
      enderecoEstado: ['', [Validators.required]],
    });
  }

  teste(event){
    console.log(event)
    console.log(this.cadastroForm.valid)
    console.log(this.cadastroForm.get('nome')?.valid)
  }

}
