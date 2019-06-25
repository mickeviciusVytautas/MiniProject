import React from 'react';
import styled from 'styled-components';

const StyledTableData =  styled.td`
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
`

const TableData = props => {
    const { header, ...children } = props;
    return <StyledTableData {...children}>
    </StyledTableData>
}

export default TableData;