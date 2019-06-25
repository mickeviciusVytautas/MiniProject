import React from 'react';
import styled from 'styled-components';

const StyledTable = styled.table`
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
`

const Table = props => {
    const { ...children } = props;
    return <StyledTable {...children}/>
}

export default Table;
