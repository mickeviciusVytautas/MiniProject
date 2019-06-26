import React from 'react';
import styled from 'styled-components';

const StyledGridColumn = styled.div`
    grid-column: ${props => props.gridColumn};
`

const GridColumn = (props) => {
    const { gridColumn, ...children } = props;
    return <StyledGridColumn
                grid-column={gridColumn}
                {...children}
            />
}

export default GridColumn;