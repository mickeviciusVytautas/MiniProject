import React from 'react';
import Header from './Header';
import Container from '../reusable/Container';
import Footer from './Footer';

const Layout = (props) => {
    const { children } = props;
    return <Container small heightStatic>
        <Header/>
        {children}
        <Footer/>
    </Container>
}

export default Layout;