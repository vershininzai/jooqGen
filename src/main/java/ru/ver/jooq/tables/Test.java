/*
 * This file is generated by jOOQ.
 */
package ru.ver.jooq.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.ver.jooq.Keys;
import ru.ver.jooq.Public;
import ru.ver.jooq.tables.records.TestRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends TableImpl<TestRecord> {

    private static final long serialVersionUID = 426019743;

    /**
     * The reference instance of <code>public.test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRecord> getRecordType() {
        return TestRecord.class;
    }

    /**
     * The column <code>public.test.id</code>. Уникальный идентификатор
     */
    public final TableField<TestRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Уникальный идентификатор");

    /**
     * The column <code>public.test.code</code>. Код
     */
    public final TableField<TestRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "Код");

    /**
     * The column <code>public.test.name</code>. Название
     */
    public final TableField<TestRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "Название");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<TestRecord, Object> COORDINATES = createField(DSL.name("coordinates"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), this, "Координаты участа");

    /**
     * Create a <code>public.test</code> table reference
     */
    public Test() {
        this(DSL.name("test"), null);
    }

    /**
     * Create an aliased <code>public.test</code> table reference
     */
    public Test(String alias) {
        this(DSL.name(alias), TEST);
    }

    /**
     * Create an aliased <code>public.test</code> table reference
     */
    public Test(Name alias) {
        this(alias, TEST);
    }

    private Test(Name alias, Table<TestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Test(Name alias, Table<TestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Test(Table<O> child, ForeignKey<O, TestRecord> key) {
        super(child, key, TEST);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<TestRecord> getPrimaryKey() {
        return Keys.TEST_PKEY;
    }

    @Override
    public List<UniqueKey<TestRecord>> getKeys() {
        return Arrays.<UniqueKey<TestRecord>>asList(Keys.TEST_PKEY);
    }

    @Override
    public Test as(String alias) {
        return new Test(DSL.name(alias), this);
    }

    @Override
    public Test as(Name alias) {
        return new Test(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(String name) {
        return new Test(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(Name name) {
        return new Test(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}