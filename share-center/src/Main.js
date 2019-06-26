import React, { Component } from "react";
import {
    Route,
    HashRouter
} from "react-router-dom";
import Home from "./Home";
import Contact from "./components/traction/Traction";
import Client from "./components/client/create/ClientContainer";
import Container from "./components/reusable/Container";
import Traction from "./components/traction/Traction";
import Layout from "./components/layout/Layout";
import ClientListContainer from "./components/client/show/ClientListContainer";

class Main extends Component {
    render() {
        return (
            <HashRouter>
                <Layout>
                    <Container fullVertical backgroundWhite heightStatic>
                        <Route exact path="/" component={Home}/>
                        <Route path="/clientList" component={ClientListContainer}/>
                        <Route path="/groups" component={Contact}/>
                        <Route path="/share" component={Client}/>
                    </Container>
                </Layout>
            </HashRouter>
        )
    }
}

export default Main;