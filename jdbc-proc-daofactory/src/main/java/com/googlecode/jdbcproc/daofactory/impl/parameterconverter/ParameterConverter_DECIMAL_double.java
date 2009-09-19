package com.googlecode.jdbcproc.daofactory.impl.parameterconverter;

import java.sql.*;
import java.math.BigDecimal;

/**
 *  DECIMAL - boolean
 */
public class ParameterConverter_DECIMAL_double implements IParameterConverter<Double> {

    public void setValue(Double aValue, PreparedStatement aStmt, int aIndex) throws SQLException {
        if(aValue!=null) {
            aStmt.setBigDecimal(aIndex, new BigDecimal(aValue));
        } else {
            aStmt.setBigDecimal(aIndex, null);
        }
    }

    public void setValue(Double aValue, CallableStatement aStmt, String aParameterName) throws SQLException {
        if(aValue!=null) {
            aStmt.setBigDecimal(aParameterName, new BigDecimal(aValue));
        } else {
            aStmt.setBigDecimal(aParameterName, null);
        }
    }

    public Double getOutputParameter(CallableStatement aStmt, String aParameterName) throws SQLException {
        BigDecimal decValue = aStmt.getBigDecimal(aParameterName);
        return decValue!=null ? decValue.doubleValue() : 0;
    }

    public Double getFromResultSet(ResultSet aResultSet, String aParameterName) throws SQLException {
        BigDecimal decValue = aResultSet.getBigDecimal(aParameterName);
        return decValue!=null ? decValue.doubleValue() : 0;
    }

    public ParameterSetterKey getKey() {
        return new ParameterSetterKey(Types.DECIMAL, double.class);
    }

    public String toString() {
        return "ParameterConverter_DECIMAL_double{}";
    }
}