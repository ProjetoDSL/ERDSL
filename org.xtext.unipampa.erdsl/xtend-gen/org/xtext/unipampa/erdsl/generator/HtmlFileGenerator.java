package org.xtext.unipampa.erdsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.unipampa.erdsl.erDsl.Attribute;
import org.xtext.unipampa.erdsl.erDsl.ERModel;
import org.xtext.unipampa.erdsl.erDsl.Entity;
import org.xtext.unipampa.erdsl.erDsl.Relation;

@SuppressWarnings("all")
public class HtmlFileGenerator extends AbstractGenerator {
  private Entity lEnt;
  
  private Entity rEnt;
  
  private Relation lRel;
  
  private Relation rRel;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = input.getContents().get(0);
    final ERModel modeloER = ((ERModel) _get);
    String _name = modeloER.getDomain().getName();
    String _plus = ("LogicalSchema_" + _name);
    String _plus_1 = (_plus + ".html");
    fsa.generateFile(_plus_1, this.CreateLogical(modeloER));
  }
  
  public CharSequence CreateLogical(final ERModel modeloER) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _html_Head = this.html_Head();
    _builder.append(_html_Head);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_DomainMapping = this.html_DomainMapping(modeloER);
    _builder.append(_html_DomainMapping);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_EntitiesMapping = this.html_EntitiesMapping(modeloER);
    _builder.append(_html_EntitiesMapping);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_RelationshipsMapping = this.html_RelationshipsMapping(modeloER);
    _builder.append(_html_RelationshipsMapping);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _html_Footer = this.html_Footer();
    _builder.append(_html_Footer);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence html_Head() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>ERtext Logical schema</title>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("body    { background: #ffffff; border: 1px solid black, padding: 5px 0 5px 0}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append(".title  { font: bold 160% serif; color: #0066FF; padding: 10px 0 10px 0; text-align: center; background: #ccc8c8}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append(".stitle { font: bold 120% sans-serif; color: #0044DD; padding: 10px 0 10px 0 }");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append(".sstitle{ font: bold 120% serif; color: #000000; background: #efefef; padding: 5px 0 5px 0; padding-left: 20px;}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append(".field  { font: 100% sans-serif; color: #000000; padding: 2px; padding-left: 50px; border: 0px solid black}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append(".value  { font: 100% sans-serif; color: #505050 }");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("footer \t{ text-align: center; padding: 3px; border: 1px; background-color: #ccc8c8; color: white;}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"panel\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<p class=\"title badge-primary\">LOGICAL SCHEMA</p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>\t\t");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_Footer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("</div>\t");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<footer>");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("<p><a href=\"https://github.com/ProjetoDSL/ERDSL\">github.com/ProjetoDSL/ERDSL</a></p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</footer>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Display of the modeled domain (database name)
   */
  private CharSequence html_DomainMapping(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p class=\"sstitle\">");
    _builder.newLine();
    _builder.append("<a href=\"#domain\" class=\"btn btn-primary\" data-toggle=\"collapse\"><i class=\"fa fa-arrows-v\" aria-hidden=\"true\"></i></a>");
    _builder.newLine();
    _builder.append("&nbsp Modelled Domain");
    _builder.newLine();
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("<div id=\"domain\" class=\"panel-body collapse in\">");
    _builder.newLine();
    _builder.append("<p class=\"field\">");
    String _upperCase = m.getDomain().getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Display of modeled entities (tables)
   */
  private CharSequence html_EntitiesMapping(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<hr style=\"width:100%;text-align:left;margin-left:0\">");
    _builder.newLine();
    _builder.append("<p class=\"sstitle\">");
    _builder.newLine();
    _builder.append("<a href=\"#entities\" class=\"btn btn-primary\" data-toggle=\"collapse\"><i class=\"fa fa-arrows-v\" aria-hidden=\"true\"></i></a>");
    _builder.newLine();
    _builder.append("&nbsp Resulting Entities");
    _builder.newLine();
    _builder.append("</p>\t ");
    _builder.newLine();
    _builder.append("<div id=\"entities\" class=\"panel-body collapse in\">");
    _builder.newLine();
    _builder.append("<p class=\"field\">");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Entity> _entities = m.getEntities();
      boolean _hasElements = false;
      for(final Entity entity : _entities) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" )</br></br>", "\t");
        }
        _builder.append("\t");
        CharSequence _html_EntityNameTag = this.html_EntityNameTag(entity);
        _builder.append(_html_EntityNameTag, "\t");
        _builder.append(" ( ");
        CharSequence _html_AtributesMapping = this.html_AtributesMapping(m, entity);
        _builder.append(_html_AtributesMapping, "\t");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append(")</br>", "\t");
      }
    }
    _builder.newLine();
    CharSequence _html_NtoN_EntityCreation = this.html_NtoN_EntityCreation(m);
    _builder.append(_html_NtoN_EntityCreation);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_EntityNameTag(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"badge badge-secondary\">");
    String _upperCase = e.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("</span>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Verification and display of primary (PK) and, at the same time, foreign (FK)
   * keys from generalizations / specializations:
   *  1) Checks for a reference to a parent entity;
   *  2) If it exists, the key that references the parent is written being primary and foreign at the same time
   * @param e The analyzed entity.
   */
  private CharSequence html_AtributesMapping(final ERModel m, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Attribute> _attributes = e.getAttributes();
      boolean _hasElements = false;
      for(final Attribute att : _attributes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        {
          boolean _isIsKey = att.isIsKey();
          if (_isIsKey) {
            CharSequence _html_AttributeStyleForPK = this.html_AttributeStyleForPK(att);
            _builder.append(_html_AttributeStyleForPK);
            _builder.newLineIfNotEmpty();
          } else {
            String _name = att.getName();
            _builder.append(_name);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      Entity _is = e.getIs();
      boolean _tripleNotEquals = (_is != null);
      if (_tripleNotEquals) {
        {
          EList<Attribute> _attributes_1 = e.getIs().getAttributes();
          for(final Attribute PKInherited : _attributes_1) {
            {
              boolean _isIsKey_1 = PKInherited.isIsKey();
              if (_isIsKey_1) {
                _builder.append(", ");
                CharSequence _html_AttributeStyleForInheritedPK = this.html_AttributeStyleForInheritedPK(PKInherited);
                _builder.append(_html_AttributeStyleForInheritedPK);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    CharSequence _html_1To1_RefCheck = this.html_1To1_RefCheck(m, e);
    _builder.append(_html_1To1_RefCheck);
    _builder.newLineIfNotEmpty();
    CharSequence _html_1ToN_RefCheck = this.html_1ToN_RefCheck(m, e);
    _builder.append(_html_1ToN_RefCheck);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence html_AttributeStyleForPK(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<font color=\"red\"><i class=\"fa fa-key\" aria-hidden=\"true\"></i></font>");
    String _lowerCase = a.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence html_AttributeStyleForInheritedPK(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<font color=\"red\"><i class=\"fa fa-key\" aria-hidden=\"true\"></i></font><font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font>");
    String _lowerCase = a.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence html_AttributeStyleForFK(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font>");
    String _lowerCase = a.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence html_1To1_RefCheck(final ERModel m, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Relation> _relations = m.getRelations();
      for(final Relation relation : _relations) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:1)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:1)")))) {
            {
              boolean _equalsIgnoreCase = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(e.getName());
              if (_equalsIgnoreCase) {
                {
                  EList<Entity> _entities = m.getEntities();
                  for(final Entity aux : _entities) {
                    {
                      boolean _equalsIgnoreCase_1 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(aux.getName());
                      if (_equalsIgnoreCase_1) {
                        {
                          Entity _is = aux.getIs();
                          boolean _tripleEquals = (_is == null);
                          if (_tripleEquals) {
                            {
                              EList<Attribute> _attributes = aux.getAttributes();
                              for(final Attribute aux2 : _attributes) {
                                {
                                  boolean _isIsKey = aux2.isIsKey();
                                  if (_isIsKey) {
                                    _builder.append(", ");
                                    CharSequence _html_AttributeStyleForFK = this.html_AttributeStyleForFK(aux2);
                                    _builder.append(_html_AttributeStyleForFK);
                                    _builder.append("_fk#1:1=1");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              }
                            }
                          } else {
                            Entity _is_1 = aux.getIs();
                            boolean _tripleNotEquals = (_is_1 != null);
                            if (_tripleNotEquals) {
                              {
                                EList<Attribute> _attributes_1 = aux.getIs().getAttributes();
                                for(final Attribute aux3 : _attributes_1) {
                                  {
                                    boolean _isIsKey_1 = aux3.isIsKey();
                                    if (_isIsKey_1) {
                                      _builder.append(", ");
                                      CharSequence _html_AttributeStyleForFK_1 = this.html_AttributeStyleForFK(aux3);
                                      _builder.append(_html_AttributeStyleForFK_1);
                                      _builder.append("_fk#1:1=2");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_1ToN_RefCheck(final ERModel m, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    Entity temp = null;
    _builder.newLineIfNotEmpty();
    {
      EList<Relation> _relations = m.getRelations();
      for(final Relation relation : _relations) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:1)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:N)")))) {
            _builder.newLine();
            {
              boolean _equalsIgnoreCase = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(e.getName());
              if (_equalsIgnoreCase) {
                {
                  EList<Entity> _entities = m.getEntities();
                  for(final Entity aux : _entities) {
                    {
                      boolean _equalsIgnoreCase_1 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(aux.getName());
                      if (_equalsIgnoreCase_1) {
                        {
                          Entity _is = aux.getIs();
                          boolean _tripleEquals = (_is == null);
                          if (_tripleEquals) {
                            CharSequence _html_ListPKtoFK = this.html_ListPKtoFK(aux);
                            _builder.append(_html_ListPKtoFK);
                            _builder.append("#1");
                            _builder.newLineIfNotEmpty();
                          } else {
                            Entity _is_1 = aux.getIs();
                            boolean _tripleNotEquals = (_is_1 != null);
                            if (_tripleNotEquals) {
                              {
                                boolean _equalsIgnoreCase_2 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                if (_equalsIgnoreCase_2) {
                                  _builder.append(", <font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font>");
                                  String _string = relation.getName().toString();
                                  _builder.append(_string);
                                  _builder.append("_fk#2");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  boolean _equalsIgnoreCase_3 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString());
                                  boolean _not = (!_equalsIgnoreCase_3);
                                  if (_not) {
                                    Object _xblockexpression = null;
                                    {
                                      EObject _target = relation.getLeftEnding().getTarget();
                                      temp = ((Entity) _target);
                                      _xblockexpression = null;
                                    }
                                    _builder.append(_xblockexpression);
                                    _builder.newLineIfNotEmpty();
                                    CharSequence _html_ListPKtoFK_1 = this.html_ListPKtoFK(temp.getIs());
                                    _builder.append(_html_ListPKtoFK_1);
                                    _builder.append("#3");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:N)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:1)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:1)")))) {
              _builder.newLine();
              {
                boolean _equalsIgnoreCase_4 = relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(e.getName());
                if (_equalsIgnoreCase_4) {
                  {
                    EList<Entity> _entities_1 = m.getEntities();
                    for(final Entity aux_1 : _entities_1) {
                      {
                        boolean _equalsIgnoreCase_5 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(aux_1.getName());
                        if (_equalsIgnoreCase_5) {
                          {
                            Entity _is_2 = aux_1.getIs();
                            boolean _tripleEquals_1 = (_is_2 == null);
                            if (_tripleEquals_1) {
                              CharSequence _html_ListPKtoFK_2 = this.html_ListPKtoFK(aux_1);
                              _builder.append(_html_ListPKtoFK_2);
                              _builder.append("#4");
                              _builder.newLineIfNotEmpty();
                            } else {
                              Entity _is_3 = aux_1.getIs();
                              boolean _tripleNotEquals_1 = (_is_3 != null);
                              if (_tripleNotEquals_1) {
                                {
                                  boolean _equalsIgnoreCase_6 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString());
                                  if (_equalsIgnoreCase_6) {
                                    _builder.append(", <font color=\"blue\"><b>");
                                    String _string_1 = relation.getName().toString();
                                    _builder.append(_string_1);
                                    _builder.append("_fk#5</b></font>");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    boolean _equalsIgnoreCase_7 = relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString());
                                    boolean _not_1 = (!_equalsIgnoreCase_7);
                                    if (_not_1) {
                                      Object _xblockexpression_1 = null;
                                      {
                                        EObject _target = relation.getLeftEnding().getTarget();
                                        temp = ((Entity) _target);
                                        _xblockexpression_1 = null;
                                      }
                                      _builder.append(_xblockexpression_1);
                                      _builder.newLineIfNotEmpty();
                                      CharSequence _html_ListPKtoFK_3 = this.html_ListPKtoFK(temp.getIs());
                                      _builder.append(_html_ListPKtoFK_3);
                                      _builder.append("#6");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Formation of entities from relations N:N.
   * 	1) Checks if there is a name for the relationship, if it does not exist, the name of the two associated entities is concatenated;
   *  2) The primary keys of the associated entities are allocated and become primary and foreign at the same time;
   *  3) If the relationship has attributes they are written at the end
   * @param m The analyzed model.
   */
  private CharSequence html_NtoN_EntityCreation(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Relation> _relations = m.getRelations();
      for(final Relation relation : _relations) {
        {
          if (((relation.getLeftEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getLeftEnding().getCardinality().equalsIgnoreCase("(1:N)")) && (relation.getRightEnding().getCardinality().equalsIgnoreCase("(0:N)") || relation.getRightEnding().getCardinality().equalsIgnoreCase("(1:N)")))) {
            {
              if (((relation.getLeftEnding().getTarget() instanceof Entity) && (relation.getRightEnding().getTarget() instanceof Entity))) {
                _builder.append("\t\t\t");
                _builder.newLine();
                {
                  boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(relation.getName());
                  if (_isNullOrEmpty) {
                    _builder.append("\t\t\t");
                    _builder.append("</br><span class=\"badge badge-secondary\">");
                    String _upperCase = relation.getLeftEnding().getTarget().toString().toUpperCase();
                    _builder.append(_upperCase, "\t\t\t");
                    _builder.append("_");
                    String _upperCase_1 = relation.getRightEnding().getTarget().toString().toUpperCase();
                    _builder.append(_upperCase_1, "\t\t\t");
                    _builder.append("</span> (");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(relation.getName());
                    boolean _not = (!_isNullOrEmpty_1);
                    if (_not) {
                      _builder.append("\t\t\t");
                      _builder.append("</br><span class=\"badge badge-secondary\">");
                      String _upperCase_2 = relation.getName().toUpperCase();
                      _builder.append(_upperCase_2, "\t\t\t");
                      _builder.append("</span> (");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
                {
                  EList<Entity> _entities = m.getEntities();
                  for(final Entity entity : _entities) {
                    _builder.append("\t\t\t");
                    _builder.newLine();
                    {
                      if ((relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(entity.getName()) && (relation.getLeftEnding().getTarget().toString() != relation.getRightEnding().getTarget().toString()))) {
                        _builder.append("\t\t\t");
                        _builder.append("<font color=\"blue\"><b>");
                        String _string = relation.getLeftEnding().getTarget().toString();
                        _builder.append(_string, "\t\t\t");
                        _builder.append("_fk</b></font>,");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t\t\t");
                    _builder.newLine();
                    {
                      if ((relation.getRightEnding().getTarget().toString().equalsIgnoreCase(entity.getName()) && (relation.getRightEnding().getTarget().toString() != relation.getLeftEnding().getTarget().toString()))) {
                        _builder.append("\t\t\t");
                        _builder.append("<font color=\"blue\"><b>");
                        String _string_1 = relation.getRightEnding().getTarget().toString();
                        _builder.append(_string_1, "\t\t\t");
                        _builder.append("_fk</b></font>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t\t\t");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.newLine();
                    {
                      if ((relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(entity.getName()) && relation.getLeftEnding().getTarget().toString().equalsIgnoreCase(relation.getRightEnding().getTarget().toString()))) {
                        {
                          EList<Attribute> _attributes = entity.getAttributes();
                          for(final Attribute attribute : _attributes) {
                            {
                              boolean _isIsKey = attribute.isIsKey();
                              if (_isIsKey) {
                                _builder.append("\t\t\t");
                                _builder.append("<font color=\"blue\"><b>");
                                String _name = attribute.getName();
                                _builder.append(_name, "\t\t\t");
                                _builder.append("__fk1</b></font>,");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                    _builder.append("\t\t\t");
                    _builder.newLine();
                    {
                      if ((relation.getRightEnding().getTarget().toString().equalsIgnoreCase(entity.getName()) && relation.getRightEnding().getTarget().toString().equalsIgnoreCase(relation.getLeftEnding().getTarget().toString()))) {
                        {
                          EList<Attribute> _attributes_1 = entity.getAttributes();
                          for(final Attribute attribute_1 : _attributes_1) {
                            {
                              boolean _isIsKey_1 = attribute_1.isIsKey();
                              if (_isIsKey_1) {
                                _builder.append("\t\t\t");
                                _builder.append("<font color=\"blue\"><b>");
                                String _name_1 = attribute_1.getName();
                                _builder.append(_name_1, "\t\t\t");
                                _builder.append("__fk2</b></font>");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                _builder.append("\t\t\t");
                _builder.newLine();
                _builder.append("\t\t\t\t\t\t");
                _builder.newLine();
                {
                  EList<Attribute> _attributes_2 = relation.getAttributes();
                  for(final Attribute attribute_2 : _attributes_2) {
                    {
                      if (((!StringExtensions.isNullOrEmpty(attribute_2.getName())) && attribute_2.isIsKey())) {
                        _builder.append("\t\t\t");
                        _builder.append(", <font color=\"red\"><b>");
                        String _name_2 = attribute_2.getName();
                        _builder.append(_name_2, "\t\t\t");
                        _builder.append("*</b></font>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
                _builder.newLine();
                {
                  EList<Attribute> _attributes_3 = relation.getAttributes();
                  for(final Attribute attribute_3 : _attributes_3) {
                    {
                      if (((!StringExtensions.isNullOrEmpty(attribute_3.getName())) && (!attribute_3.isIsKey()))) {
                        _builder.append("\t\t\t");
                        _builder.append(", ");
                        String _name_3 = attribute_3.getName();
                        _builder.append(_name_3, "\t\t\t");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
                _builder.append("\t\t\t\t\t");
                _builder.newLine();
                _builder.append("\t\t\t");
                _builder.append(")</br>");
                _builder.newLine();
                _builder.append("\t\t\t");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("</br>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence html_ListPKtoFK(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Attribute> _attributes = e.getAttributes();
      for(final Attribute att : _attributes) {
        {
          boolean _isIsKey = att.isIsKey();
          if (_isIsKey) {
            _builder.append(", <font color=\"blue\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i></font>");
            String _name = att.getName();
            _builder.append(_name);
            _builder.append("_fk");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence html_RelationshipsMapping(final ERModel m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<hr style=\"width:100%;text-align:left;margin-left:0\">");
    _builder.newLine();
    _builder.append("<p class=\"sstitle\">");
    _builder.newLine();
    _builder.append("<a href=\"#references\" class=\"btn btn-primary\" data-toggle=\"collapse\"><i class=\"fa fa-arrows-v\" aria-hidden=\"true\"></i></a>");
    _builder.newLine();
    _builder.append("&nbsp Mapped References");
    _builder.newLine();
    _builder.append("</p>\t ");
    _builder.newLine();
    _builder.append("<div id=\"references\" class=\"panel-body collapse in\">\t");
    _builder.newLine();
    _builder.append("<p class=\"field\">\t");
    _builder.newLine();
    {
      EList<Relation> _relations = m.getRelations();
      boolean _hasElements = false;
      for(final Relation relation : _relations) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("</br></br>", "");
        }
        {
          EObject _target = relation.getLeftEnding().getTarget();
          if ((_target instanceof Entity)) {
            Object _xblockexpression = null;
            {
              EObject _target_1 = relation.getLeftEnding().getTarget();
              this.lEnt = ((Entity) _target_1);
              _xblockexpression = null;
            }
            _builder.append(_xblockexpression);
            _builder.newLineIfNotEmpty();
          } else {
            Object _xblockexpression_1 = null;
            {
              EObject _target_1 = relation.getLeftEnding().getTarget();
              this.lRel = ((Relation) _target_1);
              _xblockexpression_1 = null;
            }
            _builder.append(_xblockexpression_1);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EObject _target_1 = relation.getRightEnding().getTarget();
          if ((_target_1 instanceof Entity)) {
            Object _xblockexpression_2 = null;
            {
              EObject _target_2 = relation.getRightEnding().getTarget();
              this.rEnt = ((Entity) _target_2);
              _xblockexpression_2 = null;
            }
            _builder.append(_xblockexpression_2);
            _builder.newLineIfNotEmpty();
          } else {
            Object _xblockexpression_3 = null;
            {
              EObject _target_2 = relation.getRightEnding().getTarget();
              this.rRel = ((Relation) _target_2);
              _xblockexpression_3 = null;
            }
            _builder.append(_xblockexpression_3);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("<font color=\"#505050\">Relationship: ");
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(relation.getName());
          if (_isNullOrEmpty) {
            _builder.append(" <i>_UnnamedEntity_</i> ");
          } else {
            boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(relation.getName());
            boolean _not = (!_isNullOrEmpty_1);
            if (_not) {
              String _name = relation.getName();
              _builder.append(_name);
            }
          }
        }
        _builder.append(" <i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>");
        _builder.newLineIfNotEmpty();
        {
          if ((this.lEnt != null)) {
            String _name_1 = this.lEnt.getName();
            _builder.append(_name_1);
            _builder.newLineIfNotEmpty();
          } else {
            if ((this.lRel != null)) {
              String _name_2 = this.lRel.getName();
              _builder.append(_name_2);
              _builder.newLineIfNotEmpty();
            }
          }
        }
        String _string = relation.getLeftEnding().getCardinality().toString();
        _builder.append(_string);
        _builder.append(" relates ");
        String _cardinality = relation.getRightEnding().getCardinality();
        _builder.append(_cardinality);
        _builder.newLineIfNotEmpty();
        {
          if ((this.rEnt != null)) {
            String _name_3 = this.rEnt.getName();
            _builder.append(_name_3);
            _builder.newLineIfNotEmpty();
          } else {
            if ((this.rRel != null)) {
              String _name_4 = this.rRel.getName();
              _builder.append(_name_4);
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("</font></br>");
        _builder.newLine();
        _builder.newLine();
        Object _xblockexpression_4 = null;
        {
          this.lEnt = null;
          _xblockexpression_4 = null;
        }
        _builder.append(_xblockexpression_4);
        Object _xblockexpression_5 = null;
        {
          this.rEnt = null;
          _xblockexpression_5 = null;
        }
        _builder.append(_xblockexpression_5);
        _builder.newLineIfNotEmpty();
        Object _xblockexpression_6 = null;
        {
          this.lRel = null;
          _xblockexpression_6 = null;
        }
        _builder.append(_xblockexpression_6);
        Object _xblockexpression_7 = null;
        {
          this.rRel = null;
          _xblockexpression_7 = null;
        }
        _builder.append(_xblockexpression_7);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
