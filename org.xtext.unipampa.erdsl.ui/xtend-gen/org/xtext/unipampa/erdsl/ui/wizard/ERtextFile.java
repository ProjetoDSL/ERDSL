/**
 * generated by Xtext 2.25.0
 */
package org.xtext.unipampa.erdsl.ui.wizard;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.FileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.StringSelectionTemplateVariable;

@FileTemplate(label = "ERDSL Template", icon = "file_template.png", description = "Create a template file for ERDSl.")
@SuppressWarnings("all")
public final class ERtextFile extends AbstractFileTemplate {
  private final StringSelectionTemplateVariable modelName = this.combo("Template:", new String[] { "Cars", "2", "3" }, "The logical example model");
  
  @Override
  public void generateFiles(final IFileGenerator generator) {
    StringConcatenation _builder = new StringConcatenation();
    String _folder = this.getFolder();
    _builder.append(_folder);
    _builder.append("/");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append(".erdsl");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    {
      boolean _equalsIgnoreCase = this.modelName.toString().equalsIgnoreCase("cars");
      if (_equalsIgnoreCase) {
        _builder_1.append("/*");
        _builder_1.newLine();
        _builder_1.append(" ");
        _builder_1.append("* This is an example model");
        _builder_1.newLine();
        _builder_1.append(" ");
        _builder_1.append("*/");
        _builder_1.newLine();
        _builder_1.append("Domain ");
        _builder_1.append(this.modelName);
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        _builder_1.append("Entities {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Cliente {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("idCliente int isIdentifier,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("nomeCliente string");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Carro {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("idCarro int isIdentifier,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("modelo string,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("ano int,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("valorDeMercado money");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Acidente {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("idAcidente int isIdentifier,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("causa string,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("data datetime");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Apolice {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("idApolice int isIdentifier,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("valor money,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("dataAssinatura datetime");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Premio {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("idPremio int isIdentifier,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("vencimento datetime,");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("valorPremio money");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("};");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("Relationships {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Propriedade [Cliente (1:1) relates (1:N) Carro]");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Historico \t[Carro (1:N) relates (0:N) Acidente] {vitimas int}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("Segurado \t[Carro (1:1) relates (1:1) Apolice]");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("GeraPremio\t[Apolice (1:1) relates (1:N) Premio]\t");
        _builder_1.newLine();
        _builder_1.append("};");
        _builder_1.newLine();
      } else {
        boolean _equalsIgnoreCase_1 = this.modelName.toString().equalsIgnoreCase("2");
        if (_equalsIgnoreCase_1) {
          _builder_1.newLine();
          _builder_1.newLine();
          _builder_1.append("222222");
          _builder_1.newLine();
          _builder_1.newLine();
          _builder_1.newLine();
        } else {
          boolean _equalsIgnoreCase_2 = this.modelName.toString().equalsIgnoreCase("3");
          if (_equalsIgnoreCase_2) {
            _builder_1.newLine();
            _builder_1.newLine();
            _builder_1.append("333333");
            _builder_1.newLine();
            _builder_1.newLine();
            _builder_1.newLine();
          }
        }
      }
    }
    generator.generate(_builder, _builder_1);
  }
}
